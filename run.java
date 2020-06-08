import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        menu menus = new menu();
        boolean menuPrinc = true;
       while (menuPrinc == true){
           System.out.println("Desea hacer una operacion? (S)i / (N)o");
           Scanner otraOp = new Scanner(System.in);
           String otraOpPrin = otraOp.nextLine();
           if (otraOpPrin.equals("S") || otraOpPrin.equals("s")){
               menus.menuOpciones();
           } else {
               System.out.println("Cerrando programa..." +
                       "\nGracias por usar el programa de biblioteca virtual.");
               System.out.println("           ,aodObo," +
                       "\n        ,AMMMMP~~~~" +
                       "\n     ,MMMMMMMMA." +
                       "\n  ,M;'     `YV'\n" +
                       "  AM' ,OMA,\n" +
                       " AM|   `~VMM,.      .,ama,____,amma,..\n" +
                       " MML      )MMMD   .AMMMMMMMMMMMMMMMMMMD.\n" +
                       " VMMM    .AMMY'  ,AMMMMMMMMMMMMMMMMMMMMD\n" +
                       " `VMM, AMMMV'  ,AMMMMMMMMMMMMMMMMMMMMMMM,                ,\n" +
                       "  VMMMmMMV'  ,AMY~~''  'MMMMMMMMMMMM' '~~             ,aMM\n" +
                       "  `YMMMM'   AMM'        `VMMMMMMMMP'_              A,aMMMM\n" +
                       "   AMMM'    VMMA. YVmmmMMMMMMMMMMML MmmmY          MMMMMMM\n" +
                       "  ,AMMA   _,HMMMMmdMMMMMMMMMMMMMMMML`VMV'         ,MMMMMMM\n" +
                       "  AMMMA _'MMMMMMMMMMMMMMMMMMMMMMMMMMA `'          MMMMMMMM\n" +
                       " ,AMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMa      ,,,   `MMMMMMM\n" +
                       " AMMMMMMMMM'~`YMMMMMMMMMMMMMMMMMMMMMMA    ,AMMV    MMMMMMM\n" +
                       " VMV MMMMMV   `YMMMMMMMMMMMMMMMMMMMMMY   `VMMY'  adMMMMMMM\n" +
                       " `V  MMMM'      `YMMMMMMMV.~~~~~~~~~,aado,`V''   MMMMMMMMM\n" +
                       "    aMMMMmv       `YMMMMMMMm,    ,/AMMMMMA,      YMMMMMMMM\n" +
                       "    VMMMMM,,v       YMMMMMMMMMo oMMMMMMMMM'    a, YMMMMMMM\n" +
                       "    `YMMMMMY'       `YMMMMMMMY' `YMMMMMMMY     MMmMMMMMMMM\n" +
                       "     AMMMMM  ,        ~~~~~,aooooa,~~~~~~      MMMMMMMMMMM\n" +
                       "       YMMMb,d'         dMMMMMMMMMMMMMD,   a,, AMMMMMMMMMM\n" +
                       "        YMMMMM, A       YMMMMMMMMMMMMMY   ,MMMMMMMMMMMMMMM\n" +
                       "       AMMMMMMMMM        `~~~~'  `~~~~'   AMMMMMMMMMMMMMMM\n" +
                       "       `VMMMMMM'  ,A,                  ,,AMMMMMMMMMMMMMMMM\n" +
                       "     ,AMMMMMMMMMMMMMMA,       ,aAMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                       "   ,AMMMMMMMMMMMMMMMMMMA,    AMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                       " ,AMMMMMMMMMMMMMMMMMMMMMA   AMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" +
                       "AMMMMMMMMMMMMMMMMMMMMMMMMAaAMMMMMMMMM            -JacobGT");
               menuPrinc = false;
           }
       }
    }
}
