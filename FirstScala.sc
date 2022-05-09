// object HelloWorld {
//     def main(args: Array[String]): Unit = {
//         println("Hello World");
//     }
// }

object ScalaTutorial {
    def main(args: Array[String]): Unit = {
        // var i = 0;

        // while (i < 10) {
        //     println("value of i: " + i);
        //     i += 1;
        // }

        // for ( i <- 0 to 10) {
        //     println(i);
        // }


        // var letters = "kajbdkjfanknsfknsdknfkansd";

        // for (i <- 0 until letters.length) {
        //     println(letters(i));
        // }

        // prinit a list
        // val list = List(1, 2, 3, 4);
        // for (ele <- list) {
        //     println("list item: " + ele);
        // }

        // printing even list
        // val evenList = for { 
        //     i <- 1 to 20 
        //     if (i % 2 == 0) 
        // } yield i;
        
        // for(even <- evenList) {
        //     println(even);
        // }

        def printPrimes(): Unit = {
           val list = List(1, 2, 3, 4, 5, 6);
           for (ele <- list) {
               println(ele);
               if (ele == 5) {
                   // break
                   return;
               }

               if (ele == 1) {
                   // continue
                   // println(ele);
               }
           }
        }

        printPrimes();
    }
}