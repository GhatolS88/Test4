package Inheritance;

public class Multilevel_inheritance extends whatsAppv3
{
public static void main(String[]args)
{
	WhatsAppv2 v2=new WhatsAppv2();
	v2.Audiocalling();
	v2.Textmsg();
	
	whatsAppv3 v3=new whatsAppv3();
	v3.Vidiocalling();
	v3.Audiocalling();
	v3.Textmsg();
}
}
