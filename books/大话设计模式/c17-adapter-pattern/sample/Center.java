/*
 * @Author: GZhY 
 * @Date: 2016-11-18 20:07:57 
 * @Last Modified by: GZhY
 * @Last Modified time: 2016-11-18 20:27:19
 */
class Center extends Player{
    
    public Center(String name){
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋" + name + "进攻");
    }
}