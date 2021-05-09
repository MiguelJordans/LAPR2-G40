package app.ui.console;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 */
public class DevTeamUI implements Runnable{

    public DevTeamUI()
    {

    }
    public void run()
    {
        System.out.println("\n");
        System.out.printf("Development Team:\n");
        System.out.printf("\t Daniel Costa - 1200581@isep.ipp.pt \n");
        System.out.printf("\t Lucas Silva - 1200759@isep.ipp.pt \n");
        System.out.printf("\t Mariana Lages - 1200902@isep.ipp.pt \n");
        System.out.printf("\t Miguel Jordão - 1201487@isep.ipp.pt \n");
        System.out.println("\n");
    }
}
