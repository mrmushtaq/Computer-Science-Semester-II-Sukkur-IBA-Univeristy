
class ShiftOperators
{
    public static void main (String args[])
    {
        System.out.println("Left Shift:");
        System.out.println("4>>2 : " + (4>>2)); // 4/(2 power 2)= 4/4 = 1
        System.out.println("5>>2 : " + (5>>2)); // 5/(2 power 2)= 5/4 = 1.25= 1  (if positive then take only integer, ignore values after dot)
        System.out.println("-5>>2 : " + (-5>>2)); // -5/(2 power 2)= -5/4 = -1.25= -2  (if negative then take only round off to next number, jesy -1.25 he to -2 ae ga)
        System.out.println("-16>>3 : " + (-16>>3));// -16/(2 power 3) = -16/8 = -2
        System.out.println("15>>-3 : " + (15>>-3)); //  (shifting cann't be negative (-3)) = 0
        System.out.println("15>>3 : " + (15>>3)); //  15/(2 power 3)= 15/8 = 1 
        System.out.println("15>>4 : " + (15>>4)); //  15/(2 power 4)= 15/16 = 0 
       // System.out.println(15.2>>4); //Error! number only be int type

       System.out.println("\nRight Shift:");
       System.out.println("4<<2 : " + (4<<2));    // 4*(2 power 2)= 4*4 = 16
       System.out.println("-17<<4 : " + (-17<<4));// -17*(2 power 4) = -17*16 = -272
       System.out.println("15<<-3 : " + (15<<-3)); //  (shifting cann't be negative (-3)) = (any large number)
       System.out.println("15<<3 : " + (15<<3)); //  15*(2 power 3)= 15*8 = 120 
       System.out.println("15<<4 : " + (15<<4)); //  15*(2 power 4)= 15*16 = 240 
    }
}