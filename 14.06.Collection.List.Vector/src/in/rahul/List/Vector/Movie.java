package in.rahul.List.Vector;

public class Movie implements Comparable<Movie> {
	String title;
	String language;

	public Movie(String title, String language) {
		this.title = title;
		this.language = language;
	}

	public Movie() {
		this("None", "None");
	}

	@Override
	public String toString() {
		return "Movie { Title = " + title + ", Language = " + language + " } ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	// if 0 - equals
	// if 1 - this > arg0
	// if -1 - this < arg0
	@Override
	public int compareTo(Movie arg0) {
		int result = 0;

		if ((this.title).equals(arg0.title)) {
			result = 0;
		} else if ((this.title).compareTo(arg0.title) > 0) {
			result = 1;
		} else if ((this.title).compareTo(arg0.title) < 0) {
			result = -1;
		}

		return result;
	}

}
