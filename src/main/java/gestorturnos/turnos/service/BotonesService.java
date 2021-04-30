package gestorturnos.turnos.service;

import gestorturnos.turnos.model.Botones;
import gestorturnos.turnos.repository.BotonesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BotonesService implements BotonesRepo{

    @Autowired
    private BotonesRepo botonesRepo;

    @Override
    public List<Botones> findAll() {
        return botonesRepo.findAll();
    }

    @Override
    public List<Botones> findAll(Sort sort) {
        return botonesRepo.findAll(sort);
    }

    @Override
    public Page<Botones> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Botones> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Botones botones) {
        botonesRepo.delete(botones);
    }

    @Override
    public void deleteAll(Iterable<? extends Botones> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Botones> S save(S s) {
        return botonesRepo.save(s);
    }

    @Override
    public <S extends Botones> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Botones> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Botones> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Botones> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Botones getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Botones> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Botones> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Botones> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Botones> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Botones> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Botones> boolean exists(Example<S> example) {
        return false;
    }
}
