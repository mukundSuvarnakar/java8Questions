package AnnonymousInnerClassEx;

public class Test {

    public static void main(String[] args) {

        Example1 a=new Example1() {
            @Override
            public Boolean isEligible(int age) {
                if(age>18)
                    return true;
                else
                {
                    return false;
                }

            }


        };
        a.isEligible(20);
    }


}
