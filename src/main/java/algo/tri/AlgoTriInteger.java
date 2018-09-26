package algo.tri;

import java.util.Collection;
import java.util.stream.Collectors;


import algo.TypeTri;

public class AlgoTriInteger extends AlgoTri<Integer>{

	public AlgoTriInteger(TypeTri aTypeTri) {
		super(aTypeTri);
	}

	@Override
	public Collection<Integer> trier(Collection<Integer> aTableauATrier) {
		return aTableauATrier.stream().sorted().collect(Collectors.toList());
	}


}
