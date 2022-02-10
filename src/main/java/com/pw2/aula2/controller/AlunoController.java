package com.pw2.aula2.controller;

import com.pw2.aula2.dao.AlunoDAO;
import com.pw2.aula2.entidade.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("alunos")
public class AlunoController {
    //@ResponseBody
    //@GetMapping("/exemplo")

    AlunoDAO dao;

    public AlunoController(){
        dao = new AlunoDAO();
    }

    @GetMapping("/form")
    public String form(Aluno aluno){
        return "/alunos/form";
    }

    @GetMapping("/list")
    public ModelAndView listar(ModelMap model) {
        model.addAttribute("alunos", dao.buscarAlunos());
        return new ModelAndView("/alunos/list", model);
    }

    /**
    public  String exemplo(){
        return "Controller de Pessoas!";
    }*/
}
