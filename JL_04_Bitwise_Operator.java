import java.util.Scanner;

public class JL_04_Bitwise_Operator {
    public static void main(String[] args) {
        /*
        *   In binary System
        *
        *   0000  is   0            1000  is   8
        *   0001  is   1            1001  is   9
        *   0010  is   2            1010  is   10
        *   0011  is   3            1011  is   11
        *   0100  is   4            1100  is   12
        *   0101  is   5            1101  is   13
        *   0110  is   6            1110  is   14
        *   0111  is   7            1111  is   15
        *
        *   (And)   a & b ( Returns 1 only if both the bits are 1)
        *   (Or)    a | b ( Returns 1 only if one of the bits is 1)
        *   (Xor)   a ^ b ( Returns 0 if both the bits are same otherwise returns 1)
        *   (Not)   ~a    ( Returns the complement of the bit [1 to 0, 0 to 1])
        *
        *
        *   2 =     10
        *   3 =  &  11
        * -------------------
        *           10    =   2 ( hence answer 2 )
        * -------------------
        *
        *   2 =     10
        *   3 =  |  11
        * -------------------
        *           11    =   3 ( hence answer 3 )
        * -------------------
        **
        *   2 =     10
        *   3 =  ^  11
        * -------------------
        *           01    =   1 ( hence answer 1 )
        * -------------------
        *
        * */
        System.out.println("\n---------------------------------------------------------\n");

        System.out.println("2 bitwise AND 3  = "+(2 & 3));
        System.out.println("2 bitwise OR  3  = "+(2 | 3));
        System.out.println("2 bitwise XOR 3  = "+(2 ^ 3));

        System.out.println("\n---------------------------------------------------------\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Decimal number Operand : ");
        byte firstOp = sc.nextByte();
        System.out.println("Entered Decimal Number is : " +firstOp);
        System.out.println(firstOp+" has a binary value of : " +Integer.toBinaryString(firstOp));

        System.out.print("\nEnter Second Decimal Number is : ");
        byte secondOp = sc.nextByte();
        System.out.println("Entered Second Decimal Number is : " +secondOp);
        System.out.println(secondOp+" has a binary value of : " +Integer.toBinaryString(secondOp));

        System.out.println("\n"+Integer.toBinaryString(firstOp)+" & "+
                Integer.toBinaryString(secondOp)+" => "+
                ((Integer.toBinaryString((firstOp & secondOp))))+
                " = "+(firstOp & secondOp));

        System.out.println("\n"+Integer.toBinaryString(firstOp)+" | "+
                Integer.toBinaryString(secondOp)+" => "+
                ((Integer.toBinaryString((firstOp | secondOp))))+
                " = "+(firstOp | secondOp));

        System.out.println("\n"+Integer.toBinaryString(firstOp)+" ^ "+
                Integer.toBinaryString(secondOp)+" => "+
                ((Integer.toBinaryString((firstOp ^ secondOp))))+
                " = "+(firstOp ^ secondOp));
    }
}
