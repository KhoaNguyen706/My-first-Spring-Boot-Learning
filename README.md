# My-first-Spring-Boot-Learning
This is the first time, I learn Spring Boot.  
I understand Controller -> Business Service -> Repository -> Entity/ Model
I also known how to connect with PostgreSQL using with Hibernate.
It is quite hard to understand @ for the first time.

@Autowired -> auto inject
@RestController -> inform SB that this layer is Controller
@RequestMapping -> Like route in Express ex: /api/v1/name

type ResponseEntity used for Controller layer
use List to return List of json

# SpringJPA
@Entity -> told SB this is model
@Table(name =" name of database")
@ID
@GeneratedValue(strategy = GenerationType.IDENTITY)


@CreationTimestamp
@Column(name = "created_at", nullable = false, updatable = false)

Because I am just a beginner, my code will be messy and dump.



