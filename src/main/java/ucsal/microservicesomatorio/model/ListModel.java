package ucsal.microservicesomatorio.model;

import java.io.Serializable;
import java.util.List;

public class ListModel implements Serializable {

	private static final long serialVersionUID = 1L;

	List<Integer> firstVector;

	List<Integer> secondVector;

	public List<Integer> getFirstVector() {
		return firstVector;
	}

	public void setFirstVector(List<Integer> firstVector) {
		this.firstVector = firstVector;
	}

	public List<Integer> getSecondVector() {
		return secondVector;
	}

	public void setSecondVector(List<Integer> secondVector) {
		this.secondVector = secondVector;
	}
}
