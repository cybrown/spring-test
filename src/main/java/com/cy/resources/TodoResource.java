package com.cy.resources;

import com.cy.entities.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todos")
@ResponseBody
public class TodoResource {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public Todo[] read() {
        Todo todo = new Todo();
        todo.setTitle("hello");
        return new Todo[]{todo};
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Todo read(@PathVariable long id) {
        Todo todo = new Todo();
        todo.setId(id);
        todo.setTitle("hello");
        return todo;
    }

    @RequestMapping(method = RequestMethod.PUT, value="/")
    public Todo create(@RequestBody Todo todo) {
        return todo;
    }

    @RequestMapping(method = RequestMethod.POST, value="/{id}")
    public Todo update(@RequestBody Todo todo) {
        return todo;
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/{id}")
    public boolean delete() {
        return true;
    }
}
