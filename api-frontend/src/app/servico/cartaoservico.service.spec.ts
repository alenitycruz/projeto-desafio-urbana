import { TestBed } from '@angular/core/testing';

import { CartaoservicoService } from './cartaoservico.service';

describe('CartaoservicoService', () => {
  let service: CartaoservicoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CartaoservicoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
