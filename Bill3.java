public class Bill3 {

    public static void main(String[] args) {

        // create 3 variable of names 
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];

            // create variable of total bill and Calculate personal bill
            int totalBill;
            totalBill = Integer.parseInt(args[3]); 
            double personalBill;
            personalBill = totalBill/ 3.0 ;
            
                // round the number up
                personalBill = Math.ceil(personalBill);
                    //print the data with the output
                    System.out.println("Dear " + name1+ ", " + name2 + " ,and " + name3+ " pay " + personalBill + " Shekels each");
     

    }
   
}
