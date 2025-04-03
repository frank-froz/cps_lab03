package pe.edu.tecsup.lab03.services;

public class StudentService {
    public function map()
    {
        Route::group([
            'namespace' => $this->namespace,
            'prefix' => 'students',
        ], function ($router) {
        require __DIR__ . '/routes.php';
    });
    }
}
