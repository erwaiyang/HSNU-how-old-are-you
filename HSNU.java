import java.io.*;
import java.util.Arrays;
import java.util.Calendar;

/**author: px@1245
idea credits to �i�i@1245
*/

class HSNU
{

	/* http://java.ittoolbox.com/groups/technical-functional/java-l/find-index-of-an-array-1772510 */
	public static int getIndex(String[] array, String specificValue){

		for(int i=0; i<array.length; i++){

			if(array[i].equals(specificValue)){

			return i;

			}

		}

		return -1;

	} 


	public static void main(String[] args) throws IOException
	{
		
		String[] classes =
		{
		
		"1316~1342",
		"1289~1315",
		"1262~1288",
		"1235~1261",
		"1208~1234",
		"1181~1207",
		"1154~1180",
		"1127~1153",
		"1100~1126",
		"1073~1099",
		"1046~1072",
		"1018~1045",
		"992~1017",
		"965~991",
		"938~964",
		"911~937",
		"884~910",
		"857~883",
		"830~856",
		"804~829",
		"777~803",
		"750~776",
		"724~749",
		"696~723",
		"670~695",
		"644~669",
		"618~643",
		"592~617",
		"566~591",
		"540~565",
		"514~539",
		"488~513",
		"464~487",
		"441~463",
		"417~440",
		"394~416",
		"372~393",
		"349~371",
		"327~348",
		"307~326",
		"285~306",
		"263~284",
		"243~262",
		"223~242",
		"201~222",
		"181~200",
		"161~180",
		"140~160",
		"121~139",
		"107~120",
		"98~106",
		"89~97",
		"77~88",
		"68~76",
		"62~67",
		"56~61",
		"48~55",
		"44~47",
		"41~43",
		"37~40",
		"32~36",
		"26~31",
		"20~25",
		"14~19",
		"10~13",
		"6~9",
		"3~5",
		"1~2"

		//�H��u�ݭn��s�o�̡���

		};
		
		String lastclass = classes[0];
		
		String[] newest = lastclass.split("~"); //���γ̷s���Z��
		
		int a = getIndex(classes, "1235~1261");	//���o�ѦүZ�Ť����ޭ�	
		
					
		try{
		System.out.println("===�����E�a�Z����~�֤�JAVA��===");
		System.out.println("�п�J�z���Z���G");
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int classnumber = Integer.parseInt(str);
		
		System.out.print("�z���Z���O" + classnumber);
		
		
		//�}�l�j�M�Z�����b���Ӱ϶�
		
		String Tmp;
		String[] tmp2;
		int b=-1;
		
		for(int h=0;h < classes.length;h++){
			
			Tmp = classes[h];
			tmp2 = classes[h].split("~");
			int tmp3 = Integer.parseInt(tmp2[1]);
			int tmp4 = Integer.parseInt(tmp2[0]);
			
			if(classnumber <= tmp3 && classnumber >= tmp4){
				b = h;			
			}
		
		}
		
		System.out.println("�A���b" + classes[b] + "�Z�o�@��");
		
		
		
		//���o���~�~��
		Calendar ThisYear = Calendar.getInstance();
		int ThisYear2 = ThisYear.get(Calendar.YEAR);
		
		//�p��ѦүZ�Ť���ڦ~��
		int reference_age = ThisYear2 - 1994 + 1;
		
		//�p���ڦ~��
		int d = b - a;
		int youage = reference_age + d;
		
		System.out.println("�ҥH�z���~�֬�" + youage);
		
		System.out.println("\n�����G�ѦүZ��1235~1261��" + reference_age + "���A����ұo�����G�C");
	
		
		}
		catch(java.lang.NumberFormatException e){
			
			System.out.println("�z��J�����O�Ʀr��~");
		
		}
		catch(java.lang.ArrayIndexOutOfBoundsException oe){
		
			System.out.println("�Z���W�X���{���ү�P�_���d��TAT");
		
		}
		finally{
		
			System.out.println("\n�{���]�p by PX@1245 \n IDEA FROM �i�i@1245 \n ^^");
		
		}
		
		
	}

}