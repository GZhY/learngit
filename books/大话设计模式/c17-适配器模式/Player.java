/*
* @Author: GZhY
* @Time:   2016-11-17 20:57:36
 * @Last Modified by: GZhY
 * @Last Modified time: 2016-11-17 23:27:12
*/
abstract class Player{
	protected String name;
	public Player(String name){
		this.name = name;
	}
	public abstract void Attack();
	public abstract void Defense();
}