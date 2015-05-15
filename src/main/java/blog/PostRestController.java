package blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostRestController {

	@Autowired
	private PostRepository postRepository;
	private CitaRepository citaRepository;
	private UsuarioRepository usuarioRepository;
	@RequestMapping(method = RequestMethod.GET)
	public List<Post> allPosts(Model model) {
		return postRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Post> addPost(@RequestBody Post post) {
		postRepository.save(post);		
		return new ResponseEntity<>(post,HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteItem(@PathVariable Integer id) {
		postRepository.delete(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Post getPost(@PathVariable int id) {
		return postRepository.findOne(id);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public List<Cita> getCitasUsuario(@PathVariable Long id){
		Usuario u=usuarioRepository.findOne(id);
		return u.getCitas();
	}
	@RequestMapping(value="/",method = RequestMethod.GET)
	public List<Cita> getCitasUsuario(){
		List<Cita> citasTotales = null;
		for(Usuario u:usuarioRepository.findAll())
			citasTotales.addAll(u.getCitas());
		return citasTotales;
	}
}