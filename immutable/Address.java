package immutable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Address implements Cloneable{
    
    private String city;
	private String state;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
