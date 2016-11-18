/*
 * @Author: GZhY 
 * @Date: 2016-11-18 20:21:49 
 * @Last Modified by: GZhY
 * @Last Modified time: 2016-11-18 20:31:40
 */
class Translator extends Player{
    
    private ForeignCenter foreignCenter;

    public Translator (String name) {
        super(name);
        foreignCenter = new ForeignCenter(name);
    }
    @Override
    public void attack(){
        foreignCenter.进攻();
    }
}