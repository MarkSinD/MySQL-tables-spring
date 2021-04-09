package com.pigyugov.forwarder.controller;

import com.pigyugov.forwarder.exception.UserNotFoundException;
import com.pigyugov.forwarder.model.Cooperator;
import com.pigyugov.forwarder.model.CooperatorDetail;
import com.pigyugov.forwarder.service.CooperatorService;
import com.pigyugov.forwarder.util.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

/**
 * DECRIPTION
 *
 * @author Mark Sinakaev
 * @version 1.0
 */
@Controller
@RequestMapping("/product")
public class ProductController {
/*
    @Autowired
    CooperatorService cooperatorService;

    @GetMapping("")
    public String getCooperator(Model model){
        List<Cooperator> listCooperator = cooperatorService.listAllCooperator();
        model.addAttribute("listCooperator", listCooperator);
        return "cooperator";
    }

    @GetMapping("/new")
    public String newCooperator(Model model){
        List<CooperatorDetail> cooperatorDetailList = cooperatorService.listAllCooperatorDetail();
        Cooperator cooperator = new Cooperator();
        cooperator.setEnabled(true);
        model.addAttribute("cooperator", cooperator);
        model.addAttribute("cooperatorDetailList", cooperatorDetailList);
        model.addAttribute("pageTitle", "Create New Cooperator");
        return "cooperator-form";
    }

    @PostMapping("/save")
    public String saveUser(Cooperator cooperator, RedirectAttributes redirectAttributes, @RequestParam("image") MultipartFile multipartFile) throws IOException {
        if(!multipartFile.isEmpty()){
            String fileName = StringUtils.cleanPath(Objects.requireNonNull(multipartFile.getOriginalFilename()));
            cooperator.setPhoto(fileName);
            Cooperator savedCooperator = cooperatorService.save(cooperator);
            String uploadDir = "user-photos/" + savedCooperator.getId();
            FileUploadUtil.cleanDir(uploadDir);
            FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
        }
        else{
            if(cooperator.getPhoto().isEmpty())
                cooperator.setPhoto(null);
            cooperatorService.save(cooperator);
        }
        redirectAttributes.addFlashAttribute("message", "The user has been saved successfully");
        return "redirect:/cooperator";
    }

    @GetMapping("/{id}/enabled/{status}")
    public String updateUserEnableStatus(@PathVariable("id") Integer id,
                                         @PathVariable("status") boolean enabled,
                                         RedirectAttributes redirectAttributes){
        cooperatorService.updateCooperatorEnableStatus(id, enabled);
        String status = enabled ? "enabled" : "disabled";
        String message = "The user ID " + id + " has been " + status;
        redirectAttributes.addFlashAttribute("message", message);
        return "redirect:/cooperator";
    }

    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable(name = "id") Integer id,
                           Model model,
                           RedirectAttributes redirectAttributes){
        try {
            Cooperator cooperator = cooperatorService.getUserById(id);
            List<CooperatorDetail> cooperatorDetailList = cooperatorService.listAllCooperatorDetail();
            model.addAttribute("cooperatorDetailList", cooperatorDetailList);
            model.addAttribute("cooperator", cooperator);
            model.addAttribute("pageTitle", "Edit cooperator  (ID: " + id + ")");
            return "cooperator-form";
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
            redirectAttributes.addFlashAttribute("message", e.getMessage());
            return "redirect:/cooperator";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable(name = "id") Integer id,
                             Model model,
                             RedirectAttributes redirectAttributes) {
        try {
            cooperatorService.delete(id);
            redirectAttributes.addFlashAttribute("message", "The user ID "
                    + id + " has been deleted successfully");
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
            redirectAttributes.addFlashAttribute("message", e.getMessage());
        }
        return "redirect:/cooperator";
    }*/
}