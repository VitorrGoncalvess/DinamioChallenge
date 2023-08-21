package project;


import java.util.Scanner;

import entities.EditEmail;
import entities.Register;
import entities.Validate;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstArgument, secondArgument, completeName;
        int ans;
        System.out.println("Quantos emails serão cadastrados?");
        ans = sc.nextInt();
        sc.nextLine();
        Register[] record = new Register[ans];
        Validate validator = new Validate();
        EditEmail changer; 
        
        for(int i = 0; i<ans; i++) {
        	System.out.println("Insira o seu nome e sobrenome");
        	completeName = sc.nextLine();
        	
            String[] nameParts = completeName.split(" ");
            firstArgument = nameParts[0];
            secondArgument = nameParts[1];
            record[i] = new Register();
            record[i].genEmail(firstArgument, secondArgument);
            
        }
        for(int i = 0; i<ans;i++) {
        	if(!validator.verify(record[i].getEmail())) {
        		System.out.println("Email n:#"+(i+1)+ "já existente, você possui um segundo nome?");
        		String aux = sc.nextLine();
        		if(aux.equalsIgnoreCase("SIM") || aux.equalsIgnoreCase("S")) {
        		System.out.println("Por favor, insira o nome do meio");
        		String midName = sc.nextLine();
        		changer = new EditEmail();
        		changer.genEmail(record[i].getName(), midName);
        		record[i].registrateEmail(changer.getNewEmail());
        	}else{
        		changer = new EditEmail();
        		changer.genEmail(record[i].getName(), record[i].getSecondName(), i+1);
        		record[i].registrateEmail(changer.getNewEmail());
        	}
        	}		
        }
            
        for(int i = 0; i<ans;i++) {
        	System.out.println(record[i].getEmail());
        }
        
        
        sc.close();
    }
}
