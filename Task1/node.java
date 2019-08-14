public class node{
	private int row, column;

	public node(String coords){
		row = Integer.parseInt(coords.substring(0,coords.indexOf(",")));
		column = Integer.parseInt(coords.substring(coords.indexOf(",")+1));
	}
	
	public int getRow(){
		return row;
	}
	
	public int getColumn(){
		return column;
	}

}