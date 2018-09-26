package algo.tri;

import java.util.Collection;

import algo.TypeTri;
import util.Algo;

public abstract class AlgoTri<T> implements Algo{

	TypeTri typeTri;
	
	public AlgoTri(TypeTri aTypeTri)
	{
		typeTri = aTypeTri;
	}
	public abstract Collection<T> trier(Collection<T> aTableauATrier);
}
