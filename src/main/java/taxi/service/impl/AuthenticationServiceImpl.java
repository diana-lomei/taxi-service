package taxi.service.impl;

import java.util.Optional;
import taxi.exception.AuthenticationExeption;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;
import taxi.service.AuthenticationService;
import taxi.service.DriverService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverService driverService;

    public AuthenticationServiceImpl() {
    }

    @Override
    public Driver login(String login, String password) throws AuthenticationExeption {
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isEmpty() || !driver.get().getPassword().equals(password)) {
            throw new AuthenticationExeption("Login or password was incorrect");
        }
        return driver.get();
    }
}
