package brjsys.validator;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;

import brjsys.businessrules.BusinessRule;
import brjsys.communicator.ValidatorCommunicator;

/**
 * Consente la validazione di una business rule.
 * @author Michele  Bortolato
 * @version 1.2 14 Mar 2008
 * 
 */

public class Validator {
	/**
	 * Fa comunicare Validator con eXist.
	 */
	private ValidatorCommunicator repository;

	/**
	 * Costruttore.
	 * 
	 * @param username Username per connettrsi al DBMS. 
	 * @param password Password per connettersi al DBMS.
	 * 
	 * @exception Exception Connessione fallita, contiene in che modo e'
	 *  fallita la connessione. 
	 * */
	public Validator (String username, String password) throws Exception {

		repository=new ValidatorCommunicator(username, password);
	}

	/**
	 * Valida la business rule.
	 * 
	 * @param bRule La regola da validare.
	 * 
	 * @return true se la regola viene inserita nel repository, false se nel 
	 * repository esiste gia' una regola con quel nome.
	 * 
	 * @exception Exception Errore in fase di validazione.
	 * */
	public boolean validate(BusinessRule bRule) throws Exception{
		// create a CharStream that reads from standard input
		ANTLRStringStream input;
		CommonTokenStream tokens=null;

		try {

			if (bRule.name.equals("")) {
				throw new Exception("ERR06: Nome regola inaccettabile.");
			}

			if (repository.findSameRule(bRule.rule)) {
				throw new Exception("ERR07: Testo regola gia' presente.");
			}

			input = new ANTLRStringStream(bRule.rule);

			BusinessRuleLexer lexer = new BusinessRuleLexer(input);

			tokens = new CommonTokenStream(lexer);

			BusinessRuleParser parser = 
				new BusinessRuleParser(bRule.associated, tokens);

			BusinessRuleParser.start_return r=parser.start();

			CommonTree tree= (CommonTree)r.getTree();

			XMLParser tree2XML =
				new XMLParser(BusinessRuleParser.tokenNames);

			String result=tree2XML.parse(tree, bRule);
			//controllo di fine stringa

			int position=bRule.rule.lastIndexOf(";");

			String rest=bRule.rule.substring(position+1);
			if (rest!="") {
				//almeno non ci siano caratteri
				if (!rest.matches("^\\s*$")) {
					throw new Exception("Fine regola non valido");
				}
			}
			//test su stringa XML per il controllo di regole analoghe

			return repository.insertRule(result, bRule.name);

		} catch (RecognitionException e) {
			/*Evito di far conoscere al validatore le operazioni interne, 
			 * comprese le eccezioni.
			 */
			throw new Exception(e);
		}
	}
}
