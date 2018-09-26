package algo.tri;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


import algo.TypeTri;

public class AlgoTriInteger extends AlgoTri<Integer>{

	public AlgoTriInteger(TypeTri aTypeTri) {
		super(aTypeTri);
	}

	@Override
	public Collection<Integer> trier(Collection<Integer> aTableauATrier) {
		if(typeTri.equals(TypeTri.CROISSANT))
			return aTableauATrier.stream().sorted().collect(Collectors.toList());
		else
		{
			List<Integer> vRet = new ArrayList<>();
			for(Integer vElement : aTableauATrier)
			{
				vRet = ajouterTrierDeCroissant(vRet, vElement);
			}
			return vRet;
		}
	}
	
	private static List<Integer> ajouterTrierDeCroissant(List<Integer> aListe,Integer aElement)
	{
		int position = aListe.size();
		for(int i=0; i<aListe.size();i++)
		{
			if(aListe.get(i) <= aElement)
			{
				position = i;
				break;
			}
		}
		aListe.add(position, aElement);
		return aListe;
	}


}
