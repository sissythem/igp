import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AccountBackendComponent } from './account-backend.component';

describe('AccountBackendComponent', () => {
  let component: AccountBackendComponent;
  let fixture: ComponentFixture<AccountBackendComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AccountBackendComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AccountBackendComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
