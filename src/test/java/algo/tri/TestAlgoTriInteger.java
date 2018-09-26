package algo.tri;


import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import algo.TypeTri;
import util.TestAlgo;

public class TestAlgoTriInteger extends TestAlgo<Integer>{

	@Test
	public void testAlgoTriCroissant()
	{
		//Données d'entrées et attendu
		List<Integer> vListeATrier = new ArrayList<>(Arrays.asList(7,-78,150,78,54,10,-25,2,-3,0));
		List<Integer> vListeTrieAttendu = new ArrayList<>(Arrays.asList(-78,-25,-3,0,2,7,10,54,78,150));
		
		//Creation du résolveur d'algo
		AlgoTri<Integer> vAlgoTri = new AlgoTriInteger(TypeTri.CROISSANT);
		
		//Données sorties
		Collection<Integer> vCollectionTrieSorti = vAlgoTri.trier(vListeATrier);
		
		//Création du message output
		String vMessage = resultatAlgo("Algo de tri Integer croissant", vListeATrier, vListeTrieAttendu, vCollectionTrieSorti);
		
		System.out.println(vMessage);
		assertTrue(isEqualCollection(vListeTrieAttendu, vCollectionTrieSorti));
	}
}
