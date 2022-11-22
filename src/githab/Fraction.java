/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package githab;
/**
*
* @author Student
*/
public class Fraction {
private int ch;
private int zn;
static private int countObj = 0;
private int nod = 1;

Fraction(){
ch = 0;
zn = 1;
countObj++;
}

Fraction(int chA, int znA){
countObj++;
if(znA == 0)
{
ch = 0;
zn = 1;
}
else
{
ch = chA;
zn = znA;

}
if(chA<0&&znA<0){
ch = Math.abs(chA);
zn = Math.abs(znA);
}
if(chA>0&&znA<0){
ch = -chA;
zn = Math.abs(znA);
}
}

Fraction add(Fraction objF)
{
Fraction res = new Fraction (ch * objF.zn + objF.ch * zn,zn * objF.zn);
return res;

}

boolean isEqual(Fraction objF)
{
if(objF == null)
return false;
if(ch == objF.ch && zn == objF.zn)
return true;
return false;
}
String toFormatString()
{

return ch+"/"+zn;
}
public static int getCountObject()
{
return countObj;
}

void setZn(int znA){
this.zn = znA;
}
void setCh(int chA){
ch = chA;
}

int getZn(int znA){
return zn;
}
int getCh(int chA){
return ch;
}

void CopyFraction(Fraction obj)
{
if(obj!=null)
{
ch = obj.ch;
zn = obj.zn;
} else
{
ch = 0;
zn = 1;

}

}
Fraction dev(Fraction objF)throws Exception
{
if(objF==null || objF.ch==0)
throw new Exception("Devide error in Fraktion");
Fraction res = new Fraction (ch * objF.zn ,zn * objF.ch);
return res;

}
Fraction subtraction(Fraction objF)
{
if(objF!=null|| objF.zn!=0){
Fraction res = new Fraction (ch * objF.zn - objF.ch * zn,zn * objF.zn);
return res;
}
else{
ch = 0;
zn = 1;
Fraction res = new Fraction (ch ,zn);
return res;
}
}
Fraction multiplication(Fraction objF)
{
if(objF!=null|| objF.ch!=0){
Fraction res = new Fraction (ch * objF.ch,zn * objF.zn);
return res;
}
else{
ch = 0;
zn = 1;
Fraction res = new Fraction (ch ,zn);
return res;
}
}

}
