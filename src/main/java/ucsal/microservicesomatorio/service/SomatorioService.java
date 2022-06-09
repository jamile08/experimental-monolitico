package ucsal.microservicesomatorio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ucsal.microservicesomatorio.model.ListModel;

@Service
public class SomatorioService {

	public List<Integer> getValorSomatorio(ListModel parametros) {

		List<Integer> thirdVector = new ArrayList<>();

		for (int i = 0; i < parametros.getFirstVector().size(); i++) {
			thirdVector.add(parametros.getFirstVector().get(i) + parametros.getSecondVector().get(i));
			System.out.println(thirdVector.get(i));
		}

		return thirdVector;
	}
}