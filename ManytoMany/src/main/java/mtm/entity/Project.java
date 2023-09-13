package mtm.entity;



import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Project {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;

	    @ManyToMany(mappedBy = "projects")
	    private Set<Employee> employees = new HashSet<>();

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Set<Employee> getEmployees() {
			return employees;
		}

		public void setEmployees(Set<Employee> employees) {
			this.employees = employees;
		}

		public Project(Long id, String name, Set<Employee> employees) {
			super();
			this.id = id;
			this.name = name;
			this.employees = employees;
		}

		public Project() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}