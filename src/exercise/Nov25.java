package exercise;

public class Nov25 {
	public int StrToInt(String strs) {
		if(strs.equals("")||strs.length()==0)
		return 0;
		char[] c=strs.toCharArray();
		//���ַ���ת�����ַ�����
		int fuhao=0;
		if(c[0]=='-')//����ַ���������λΪ-�����Ǹ���
			fuhao=1;
		int sum=0;
		for(int i=fuhao;i<c.length;i++)
		{	if(c[i]=='+')
				continue;
		    if(c[i]<48||c[i]>57)
		    	return 0;//0��ASCII��48��9��ASCII��57
		    sum=sum*10+c[i]-48;
		}   	
		return fuhao==0?sum:sum*-1;
		
	}

}
