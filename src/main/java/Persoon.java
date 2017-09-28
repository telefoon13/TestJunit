import java.util.Iterator;
import java.util.List;

	public class Persoon {
		private List<String> voornamen;

		public Persoon(List<String> voornamen) {
			if (voornamen == null){
				throw new NullPointerException();
			}
			if (voornamen.size() < 1) {
				throw new IllegalArgumentException();
			}
			for (String voornaam : voornamen) {
				if (voornaam == null){
					throw new NullPointerException();
				}
				if (voornaam.length() < 1){
					throw new IllegalArgumentException();
				}
				if (voornamen.lastIndexOf(voornaam) != voornamen.indexOf(voornaam)){
					throw new IllegalArgumentException();
				}
			}
			this.voornamen = voornamen;
		}

		@Override
		public String toString() {
			StringBuffer sb = new StringBuffer();
			for (String voornaam : voornamen) {
				sb.append(voornaam);
				sb.append(" ");
			}
			sb.deleteCharAt(sb.length() - 1);
			return sb.toString();
		}
	}