# CollatzConj
Inspired by the Collatz conjecture, this project aims to find the alleged "infinite number" that of this theorum.
As it is in its beginning phase, we are still prototyping.

Currently two people are working on this, one (me) in Java, and the other in C#.

 while(num != 1)
        {
            if(num % 2 == 0){
                num = num/2;
                System.out.println(num);
            }

            //or odd
            else {
                num = num*3 + 1;
                System.out.println(num);
            }
        }