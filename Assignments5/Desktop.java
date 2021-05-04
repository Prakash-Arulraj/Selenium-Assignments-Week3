package week3.day1.Assignments5;
/* assignment 5(abstract class):
interface : hardware
methods : hardwareresources()

create another one interface
interface :software
methods : softwareresources()

class : desktop
methods : desktopmodel()

description:
create 2 interface and archieve multiple inheritance.
*/

public class Desktop implements Hardware , Software{

	

	@Override
	public void softwareResources() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hardwareResources() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Desktop mylap = new Desktop();
		mylap.softwareResources();
		mylap.hardwareResources();
	}

}
