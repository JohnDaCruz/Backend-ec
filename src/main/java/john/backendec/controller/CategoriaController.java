package john.backendec.controller;

import john.backendec.entity.CategoriaEntity;
import john.backendec.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/categorias")
public class CategoriaController{

    @Autowired
    CategoriaService categoriaService;

    @GetMapping("/{id}")
    public ResponseEntity<?> buscar(@PathVariable int id){
        var categoria = categoriaService.buscar(id);
        return ResponseEntity.ok(categoria);
    }

    @PostMapping("/salvar")
    public ResponseEntity<Object> salvar(@RequestBody CategoriaEntity categoria){
        CategoriaEntity categoriaSalvar = categoriaService.salvar(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body("Categoria criado com sucesso\n" + categoriaSalvar);
    }
}
