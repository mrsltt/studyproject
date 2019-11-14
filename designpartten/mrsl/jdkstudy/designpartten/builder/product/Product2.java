package mrsl.jdkstudy.designpartten.builder.product;

import java.util.ArrayList;
import java.util.List;

/**
 * 需要建造的对象2
 * @author Administrator
 *
 */
public class Product2 {

	private List<String> part =  new ArrayList<String>();;

	public List<String> getPart() {
		return part;
	}

	public void setPart(List<String> part) {
		this.part = part;
	}
	@Override
	public String toString() {
		String returnInfo = "Product2";
		for (String string : part) {
			returnInfo+=string;
		}
		return returnInfo;
	}
	
	
}
