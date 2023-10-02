/* Willow Mesrobian 
Period 1 
AP Computer Science 
Daily Routine assignment*/

public class DailyRoutine {
     public static void main (String[] args) {
     EnterClassroom();
     StartClasswork();
     SaveWork();
     LeavingClassroom();
     }
     
     public static void EnterClassroom() {
     //What you do when you first enter the classroom
     System.out.println("Enter the classroom.");
     System.out.println("find your preffered or assigned work station.");
     System.out.println("If there is trash at your workstation, please notify Mr. Krokower.");
     }
     
     public static void StartClasswork() {
     //Starting the classwork for the day and till the end of the class
     System.out.println("Log into your workstation.");
     System.out.println("Open up the application that is relevant to that day's work (e.g. jGrasp, Github, AP Classroom).");
     System.out.println("Write code, read documentation or work ahead until the rest of the class is ready.");
     System.out.println("Listen to a lecture.");
     System.out.println("Do a programming challenge or project.");
     System.out.println("Submit your assignments.");
     System.out.println("Watch an AP video.");
     System.out.println("Work ahead on a project.");
     }
     
     public static void SaveWork() {
     //Saving your work for the day and closing up all of your work
     System.out.println("Save all of your work.");
     System.out.println("Commit all of your work to Git.");
     System.out.println("Upload all of your work to Github.");
     System.out.println("Close all of your open applications.");
     }
     
     public static void LeavingClassroom() {
     //Things that have to happen before you leave the classroom, cleaning up
     System.out.println("Log out of your workstation.");
     System.out.println("Clean up your desktop.");
     System.out.println("Look under your desk for items and trash.");
     System.out.println("Clean up your desktop.");
     System.out.println("Push in your chair.");
     System.out.println("Exit the classroom.");
     }
}