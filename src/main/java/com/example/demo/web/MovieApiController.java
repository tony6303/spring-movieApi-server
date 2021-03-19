package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Movie;
import com.example.demo.domain.MovieRepository;
import com.example.demo.domain.ResponseDto;

@RestController
@RequestMapping("api/movie")
public class MovieApiController {

	@Autowired
	private MovieRepository movieRepository;
	
	@GetMapping({"","/"})
	public ResponseDto<?> findAll() {
		return new ResponseDto<List<Movie>>(1,movieRepository.findAll());
	}

	@DeleteMapping("/{id}")
	public ResponseDto<?> deleteById(@PathVariable long id) {
		movieRepository.deleteById(id);
		return new ResponseDto<>(1,null);
	}
}
