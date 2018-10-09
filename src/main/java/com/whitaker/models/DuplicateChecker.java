package com.whitaker.models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;


public class DuplicateChecker implements IDuplicateChecker {
	
	/**
	 * the error message for null pattern
	 */
	public static final String NULL_DUPLICATE_CHECKER = "Null Duplicate Checker.";
	
	private IPassword password;
	
	// our password as a Stringp[]
	private String[] pwordArray;
	
	// the duplicates if any
	private Map<Character, Integer> dups;
	
	//keys
	private Set<Character> keys;
	
	// did we get any duplicates?
	private boolean hasDuplicates = false;
	

	public DuplicateChecker(final IPassword password) {
		// we will have already checked if the password.getPasswordText() is not null
		this.password = password;
		this.dups = new HashMap<Character, Integer>();
		this.keys = this.dups.keySet();
	}

	@Override
	public boolean hasDuplicates() {
		char[] chars = this.password.getPasswordText().toCharArray();
		// loop on our password
		for(Character ch : chars) {
			if (this.dups.containsKey(ch)) {
				this.dups.put(ch, this.dups.get(ch) + 1);
				this.hasDuplicates = true;
			} else {
				this.dups.put(ch, 1);
			}
		}
		return this.hasDuplicates;
	}
	
	@Autowired
	public Map getDuplicates() {
		return this.dups;
	}

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String pwordtext = null;
		System.out.println("Enter a password to check for duplicates...");
		try {
			while (pwordtext == null) {
				pwordtext = reader.readLine();
				System.out.println("Got Password: " + pwordtext);

				// let's do our length validation
				IPassword pword = new Password(pwordtext);
				
				// dup checker
				IDuplicateChecker dc = new DuplicateChecker(pword);
				if(dc.hasDuplicates()) {
					Map somedups = dc.getDuplicates();
					System.out.println("We have duplicates");
				}
				else {
					System.out.println("No Duplicates.");
				}
				System.out.println("Finished... OK");
			}

		} catch (IOException e) {
			System.out.println("IOException Occurred.");
			e.printStackTrace();
		}
		finally {
			System.exit(0);
		}
	}

}
