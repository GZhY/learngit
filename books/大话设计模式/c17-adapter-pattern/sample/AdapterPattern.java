/*
 * @Author: GZhY 
 * @Date: 2016-11-18 10:05:49 
 * @Last Modified by: GZhY
 * @Last Modified time: 2016-11-18 20:27:50
 */
public class AdapterModel {
    
    public static void main(String[] args) {
        Player player = new Center("zhangsan");
        player.attack();
        player = new Translator("yaoming");
        player.attack();
    }
}