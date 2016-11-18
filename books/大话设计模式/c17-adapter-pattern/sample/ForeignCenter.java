/*
 * @Author: GZhY 
 * @Date: 2016-11-18 20:09:53 
 * @Last Modified by: GZhY
 * @Last Modified time: 2016-11-18 20:21:16
 */
class ForeignCenter {

    private String name;

    public String getName(){ return name; }

    public void setName(String name){
        this.name = name;
    }

    public ForeignCenter (String name) {
        this.name = name;
    }

    public void 进攻(){
        System.out.println("外籍中锋" + name + "进攻");
    }
}