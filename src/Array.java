public class Array {

    public static void main(String[] args) {
        int[][] customers = {{1,2},{2,5},{4,3}};
        System.out.println(averageWaitingTime(customers));
    }

    public static double averageWaitingTime(int[][] customers) {

        int prepTime = customers[0][0] + customers[0][1];
        double waitingTime = prepTime - customers[0][0];

        for(int i=1; i<customers.length; i++){
            if(prepTime > customers[i][0])
                prepTime += customers[i][1];
            else
                prepTime = customers[i][0] + customers[i][1];

            waitingTime += prepTime - customers[i][0];
        }

        return waitingTime / customers.length;
    }
}
