// TODO Convert date to string

//? Seperate year, month and day and then convert them in number and then to binary number and then append to string builder also
//? append - after year binary string and then return the string builder


public class convertDataToBinary {
    public static void main(String[] args) {
        // Eg: date
        String date = "2025-03-04";

        // Retrive year, month, and day
        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        String day = date.substring(8, 10);

        // Create a string builder
        StringBuilder sb = new StringBuilder();

        // Append all binary string and seperator one by one
        sb.append(Integer.toBinaryString(Integer.parseInt(year))).append("-")
                .append(Integer.toBinaryString(Integer.parseInt(month)))
                .append("-").append(Integer.toBinaryString(Integer.parseInt((day))));

        // print the string
        System.out.println(sb);
    }
}
