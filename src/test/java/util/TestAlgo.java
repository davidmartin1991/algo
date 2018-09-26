package util;

import java.util.Collection;
import java.util.List;

public class TestAlgo<T> {

	private static final String sautDeLigne = System.getProperty("line.separator");
	private static final String etoiles = "********************************************";
	
	protected static String resultatAlgo(String aNomAlgo, Object aInput, Object aExpected, Object aOutput)
	{
		StringBuilder vStringBuilder = new StringBuilder();
		vStringBuilder.append(etoiles).append(sautDeLigne);
		vStringBuilder.append(aNomAlgo).append(sautDeLigne);
		vStringBuilder.append(etoiles).append(sautDeLigne).append(sautDeLigne);
		vStringBuilder.append("Données d'entrée : ").append(sautDeLigne);
		vStringBuilder.append(aInput.toString()).append(sautDeLigne);
		vStringBuilder.append("Données de sorti : ").append(sautDeLigne);
		vStringBuilder.append(aOutput.toString()).append(sautDeLigne);
		vStringBuilder.append("Données attendu : ").append(sautDeLigne);
		vStringBuilder.append(aExpected.toString()).append(sautDeLigne);
		return vStringBuilder.toString();
		
	}
	
	protected boolean isEqualCollection(List<T> aListeAttendu, Collection<T> aCollectionSortie)
	{
		if(aListeAttendu == null || aListeAttendu.isEmpty())
			return aCollectionSortie == null || aCollectionSortie.isEmpty();
		if(aListeAttendu.size() != aCollectionSortie.size())
			return false;
		
		int vCompteur = 0;
		for(T vElement : aCollectionSortie)
		{
			if(!vElement.equals(aListeAttendu.get(vCompteur)))
				return false;
			
			vCompteur++;

		}
		return true;
		
	}
}
