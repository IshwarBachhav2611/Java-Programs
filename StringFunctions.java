class StringFunctions{
    public static void main(String[] args){
        String text1 = "  Java Programming  ";
        String text2 = "Java Programming";

        //length()
        System.out.println("Length :"+text1.length());

        //charAt()
        System.out.println("Character at Index 0: "+text1.charAt(2));

        //trim()
        String trimmed = text1.trim();
        System.out.println("Trimmed String:"+trimmed);

        //toUpperCase()
        System.out.println("In Uppercase:"+trimmed.toUpperCase());

        //toLowerCase()
        System.out.println("In Lowercase:"+trimmed.toLowerCase());

        //equals()
        System.out.println("Equals:"+text1.equals(text2));

        //equalsIgnoreCase()
        System.out.println("equalsIgnoreCase:"+trimmed.equalsIgnoreCase(text2));

        //subString()
        System.out.println("subString:"+trimmed.substring(0, 4));

        //contains()
        System.out.println("contains:"+trimmed.contains("Java"));

        //replace()
        System.out.println("replace:"+trimmed.replace("Java", "python"));

        //indexOf()
        System.out.println("indexOf:"+trimmed.indexOf("Programming"));

        //startsWith()
        System.out.println("startsWith:"+trimmed.startsWith("Java"));

        //endsWith()
        System.out.println("endsWith:"+trimmed.endsWith("ming"));




        
    }
}