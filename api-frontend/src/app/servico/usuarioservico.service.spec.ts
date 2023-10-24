import { TestBed } from '@angular/core/testing';

import { UsuarioservicoService } from './usuarioservico.service';

describe('UsuarioservicoService', () => {
  let service: UsuarioservicoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UsuarioservicoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
