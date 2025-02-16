package dev.ppkhony.lab01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/handytools")
public class UrbanExplorerToolsController {
    private final UrbanExplorerToolsRepository repository;

    UrbanExplorerToolsController(UrbanExplorerToolsRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<UrbanExplorerTools> getAllTools() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UrbanExplorerTools> getToolById(@PathVariable Long id) {
        Optional<UrbanExplorerTools> tool = repository.findById(id);
        if (tool.isPresent()) {
            return ResponseEntity.ok(tool.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public UrbanExplorerTools createTool(@RequestBody UrbanExplorerTools tool) {
        return repository.save(tool);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UrbanExplorerTools> updateTool(@PathVariable Long id,
            @RequestBody UrbanExplorerTools toolDetails) {
        Optional<UrbanExplorerTools> tool = repository.findById(id);
        if (tool.isPresent()) {
            UrbanExplorerTools updatedTool = tool.get();
            updatedTool.setName(toolDetails.getName());
            updatedTool.setCategory(toolDetails.getCategory());
            updatedTool.setOwner(toolDetails.getOwner());
            updatedTool.setCondition(toolDetails.getCondition());
            updatedTool.setAvailability(toolDetails.isAvailability());
            updatedTool.setLastUsedDate(toolDetails.getLastUsedDate());
            updatedTool.setLocation(toolDetails.getLocation());
            updatedTool.setSpecifications(toolDetails.getSpecifications());
            updatedTool.setNotes(toolDetails.getNotes());
            return ResponseEntity.ok(repository.save(updatedTool));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTool(@PathVariable Long id) {
        Optional<UrbanExplorerTools> tool = repository.findById(id);
        if (tool.isPresent()) {
            repository.delete(tool.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
