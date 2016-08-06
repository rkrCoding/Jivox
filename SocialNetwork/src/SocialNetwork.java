import java.io.*;
public class SocialNetwork {

	public static void main()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("*************** Social Network ***************");
		System.out.println("1. Admin Panel");
		System.out.println("2. Add User");
		System.out.println("3. Fetch Friend List");
		int choice= Integer.parseInt(br.readLine());
		switch(choice)
		{
			case(1):
				System.out.println("USERNAME : ");
				String username = br.readLine();
				System.out.println("PASSWORD: ");
				String pass = br.readLine();
				if(username=="ADMIN" && pass=="ADMIN")
				{
					System.out.println(" Please Enter the Number Of Machines in the Server");
					int mSize= Integer.parseInt(br.readLine());
					for(int i=0;i<mSize;i++)
					{
						int mid= Integer.parseInt(br.readLine());
						Machine m= new Machine();
						m.machineID=mid;
						Server S= new Server();
						S.addMachine(m);
					}
				}
				break;
			case(2):
				Person P1= new Person();
				P1.setInfo();
				Machine M= new Machine();
				M.addPerson(P1);
				break;
			case(3):
				System.out.println("Enter the Person id");
				int id=Integer.parseInt(br.readLine());
				System.out.println("Enter the Machine  id");
				int mid=Integer.parseInt(br.readLine());
				Person temP= new Person();
				temP.lookUpFriend(mid,id);
				break;
			
				
			
				
		}
	}
}
