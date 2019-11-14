package mrsl.jdkstudy.designpartten.builder.product;

import java.util.ArrayList;
import java.util.List;

public class Product1 {

	private List<String> part = new ArrayList<String>();

	public List<String> getPart() {
		return part;
	}

	public void setPart(List<String> part) {
		this.part = part;
	}
	@Override
	public String toString() {
		String returnInfo = "Product1";
		for (String string : part) {
			returnInfo+=string;
		}
		return returnInfo;
	}
}
